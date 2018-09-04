package es.cvjpy;

import java.io.Serializable;
import java.util.logging.ConsoleHandler;
import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class ErroresHandler extends ConsoleHandler implements Serializable {

    private int nLineasInfos;
    private int nLineasErrors;
    private JTextArea sacoErrores = null;
    private JTextArea sacoInfos = null;

    public void setTextArea(JTextArea sacoErrores, JTextArea sacoInfos) {
        this.sacoErrores = sacoErrores;
        this.sacoInfos = sacoInfos;
    }
    private Level level = Level.INFO; // The logging level for this handler, which is configurable.

    /*
     * Must include filtering mechanism as it is not included in the (lame)
     * Abstract Handler class.
     */
    public ErroresHandler() {
        Filter filter = new Filter() {

            @Override
            public boolean isLoggable(LogRecord record) {
                return record.getLevel().intValue() >= level.intValue();
            }
        };
        this.setFilter(filter);
    }

    @Override
    public void publish(LogRecord logRecord) {
        // Must filter our own logRecords, (lame) Abstract Handler does not do it for us.
        if (!getFilter().isLoggable(logRecord)) {
            return;
        }

        String mensaje = new SimpleFormatter().format(logRecord);
        if (logRecord.getLevel().equals(Level.INFO)) {
            mensaje = logRecord.getMessage();
        }
        final String message = mensaje;
        // Append formatted message to textareas using the Swing Thread.
        if (logRecord.getLevel().equals(Level.SEVERE)) { //Por errores si, y sólo si, es SEVERE
            SwingUtilities.invokeLater(new Runnable() {

                @Override
                public void run() {
                    if (sacoErrores != null) {
                        if (nLineasErrors > 65535) { //
                            nLineasErrors = 0;
                            sacoInfos.setText("");
                        }
                        nLineasErrors++;
                        sacoErrores.append(message + "\n");
                    }
                }
            });
        }
        SwingUtilities.invokeLater(new Runnable() { // Por infos, todos los demás

            @Override
            public void run() {
                if (sacoInfos != null) {
                    if (nLineasInfos > 65535) { //65535
                        nLineasInfos = 0;
                        sacoInfos.setText("");
                    }
                    nLineasInfos++;
                    sacoInfos.append(message + "\n");
                }
            }
        });

    }

    @Override
    public void close() throws SecurityException {
        flush();
    }

    @Override
    public void flush() {
        if (sacoErrores != null) {
            sacoErrores.append("\n");
        }
        if (sacoInfos != null) {
            sacoInfos.append("\n");
        }
    }

    /**
     * Must capture level to use in our custom filter, because this is not done
     * in the abstract class.
     *
     * @param level
     */
    @Override
    public void setLevel(Level level) {
        this.level = level;
        super.setLevel(level);
    }
}
