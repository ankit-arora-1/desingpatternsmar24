package factory;

public class Flutter {
    private SupportedPlatforms supportedPlatforms;

    public Flutter(SupportedPlatforms supportedPlatforms) {
        this.supportedPlatforms = supportedPlatforms;
    }

    public void setRefreshRate() {
        System.out.println("Setting refresh rate");
    }

    public UIFactory createUIFactory() {
        return UIFactoryFactory.getUIFactory(supportedPlatforms);
    }
}
