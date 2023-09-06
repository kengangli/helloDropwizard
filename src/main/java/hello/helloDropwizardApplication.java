package hello;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class helloDropwizardApplication extends Application<helloDropwizardConfiguration> {

    public static void main(final String[] args) throws Exception {
        new helloDropwizardApplication().run(args);
    }

    @Override
    public String getName() {
        return "helloDropwizard";
    }

    @Override
    public void initialize(final Bootstrap<helloDropwizardConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final helloDropwizardConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
