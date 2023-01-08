package intro.to.design.patterns.using.javalang.adapter.inheritance;

import intro.to.design.patterns.using.javalang.adapter.Banner;

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
