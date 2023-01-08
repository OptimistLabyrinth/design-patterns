package intro.to.design.patterns.using.javalang.adapter.banner.inheritance;

import intro.to.design.patterns.using.javalang.adapter.banner.Banner;

public class PrintInheritanceBannerInheritance extends Banner implements PrintInheritance {
    public PrintInheritanceBannerInheritance(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
