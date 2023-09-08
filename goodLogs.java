import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.LogManager;

@Slf4j
public class Test {

    private static Logger logger = LoggerFactory.getLogger(Slf4j.class);
    private String orderstatus = "finished";
    private int errorcode = 404;
    private String user = "N-able";
    private Long transactionId = 123L;

    void myFunc0() {
        logger.info(String.format("Log message info: orderstatus={%s}, errorcode={%d}, user={%s}, transactionid={%d}", orderstatus, errorcode, user, transactionId));
    }

    void myFunc1() {
        Logger localLogger = (Logger) LoggerFactory.getLogger(Slf4j.class);
        localLogger.error(String.format("Log message error: orderstatus={%s}, errorcode={%d}, user={%s}, transactionid={%d}",
                orderstatus,
                errorcode,
                user,
                transactionId
        ));

        int a = 10;

        for(int i = 0; i < a; i++) {
            log.warning(String.format("Log message warn: orderstatus={%s}, errorcode={%d}, user={%s}, transactionid={%d}", orderstatus, errorcode,
                    user,
                    transactionId
            ));
        }

        LogManager
                .
                getLogger().info(String.
                        format(
                                "Log message info: orderstatus={%s}, errorcode={%d}, user={%s}, transactionid={%d}",
                                orderstatus, errorcode,
                                user, transactionId
                        )
                );
    }

    void myFunc2() {
        LoggerFactory
                .getLogger(Slf4j.class)
                .warning(
                    String.format("Log message warn: orderstatus={%s}, errorcode={%d}, user={%s}, transactionid={%d}",
                            orderstatus,
                            errorcode,
                            user,
                            transactionId
                    ));


        Logger.getLogger().info(String.format("Log message warn: orderstatus={%s}, errorcode={%d}, user={%s}, transactionid={%d}",
                orderstatus,
                errorcode,
                user,
                transactionId
        ));
    }

    void myFunc3() {
        log.debug("Log message warn: orderstatus=" + orderstatus + ", errorcode=" + errorcode + ", user=" + user + ", transactionid=" + transactionId.toString());
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.myFunc0();

        LogManager.getLogManager().getLogger("LogManager").warning("Log message warn: orderstatus=" +
                test.orderstatus + ", errorcode=" + test.errorcode +
                ", user=" + test.user + ", transactionid=" +
                test.transactionId.toString());
    }
}
