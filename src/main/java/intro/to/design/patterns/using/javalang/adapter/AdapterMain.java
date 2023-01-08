package intro.to.design.patterns.using.javalang.adapter;

import intro.to.design.patterns.using.javalang.adapter.delegation.PrintDelegation;
import intro.to.design.patterns.using.javalang.adapter.delegation.PrintDelegationBannerDelegation;
import intro.to.design.patterns.using.javalang.adapter.inheritance.PrintInheritance;
import intro.to.design.patterns.using.javalang.adapter.inheritance.PrintInheritanceBannerInheritance;

public class AdapterMain {
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
