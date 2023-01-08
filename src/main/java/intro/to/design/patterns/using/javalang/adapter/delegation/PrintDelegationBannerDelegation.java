package intro.to.design.patterns.using.javalang.adapter.delegation;

import intro.to.design.patterns.using.javalang.adapter.Banner;

public class PrintDelegationBannerDelegation extends PrintDelegation {
    private final Banner banner;

    public PrintDelegationBannerDelegation(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
