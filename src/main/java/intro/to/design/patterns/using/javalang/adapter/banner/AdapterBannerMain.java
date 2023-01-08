package intro.to.design.patterns.using.javalang.adapter.banner;

import intro.to.design.patterns.using.javalang.adapter.banner.delegation.PrintDelegation;
import intro.to.design.patterns.using.javalang.adapter.banner.delegation.PrintDelegationBannerDelegation;
import intro.to.design.patterns.using.javalang.adapter.banner.inheritance.PrintInheritance;
import intro.to.design.patterns.using.javalang.adapter.banner.inheritance.PrintInheritanceBannerInheritance;

public class AdapterBannerMain {
    public static void main(String[] args) {
        PrintInheritance printInheritance = new PrintInheritanceBannerInheritance("Hello");
        printInheritance.printWeak();
        printInheritance.printStrong();
        System.out.println();

        PrintDelegation printDelegation = new PrintDelegationBannerDelegation("Hello");
        printDelegation.printWeak();
        printDelegation.printStrong();
        System.out.println();
    }
}
