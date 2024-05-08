package factory;

public class UIFactoryFactory {

    // Practical factory
    // A factory method that returns an object for the same class
    public static UIFactory getUIFactory(SupportedPlatforms supportedPlatforms) {
        if(supportedPlatforms == SupportedPlatforms.ANDROID) {
            return new AndroidUIFactory();
        } else if(supportedPlatforms == SupportedPlatforms.IOS) {
            return new IOSUIFactory();
        }

        return null;
    }
}
