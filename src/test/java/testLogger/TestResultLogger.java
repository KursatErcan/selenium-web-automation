package testLogger;

import logger.Log;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class TestResultLogger implements TestWatcher {
    private final Log log = new Log();
    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        log.info(context.getDisplayName() + " DISABLED with cause : "+ reason);

    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        log.info(context.getDisplayName() + " PASSED");
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        log.info(context.getDisplayName() + " ABORTED with cause : "+cause.getMessage());

    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {

        log.info(context.getDisplayName() + " FAILED with cause : "+cause.getMessage());
    }
}
