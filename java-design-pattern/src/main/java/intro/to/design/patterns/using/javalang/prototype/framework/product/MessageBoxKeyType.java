package intro.to.design.patterns.using.javalang.prototype.framework.product;

public enum MessageBoxKeyType implements ProductKeyType {
    WARNING_BOX("warning box"),
    VERTICAL_LINE_BOX("vertical line box"),
    ;

    private final String keyType;

    MessageBoxKeyType(String keyType) {
        this.keyType = keyType;
    }

    @Override
    public String getKeyType() {
        return keyType;
    }
}
