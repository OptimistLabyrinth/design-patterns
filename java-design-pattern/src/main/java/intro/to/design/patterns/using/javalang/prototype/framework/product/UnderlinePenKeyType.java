package intro.to.design.patterns.using.javalang.prototype.framework.product;

public enum UnderlinePenKeyType implements ProductKeyType {
    STRONG_MESSAGE("strong message"),
    ;

    private final String keyType;

    UnderlinePenKeyType(String keyType) {
        this.keyType = keyType;
    }

    @Override
    public String getKeyType() {
        return keyType;
    }
}
