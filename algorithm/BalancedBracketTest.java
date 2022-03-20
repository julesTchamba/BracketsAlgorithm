package algorithm;

import org.junit.jupiter.api.Assertions;


class BalancedBracketTest {

    @org.junit.jupiter.api.Test
    void isBalanced() {
        BalancedBracket balancedBracket = new BalancedBracket();

        Assertions.assertEquals(balancedBracket.isBalanced("abc"),false);
        Assertions.assertEquals(balancedBracket.isBalanced("abc()())"),false);
        Assertions.assertEquals(balancedBracket.isBalanced(""),true);
        Assertions.assertEquals(balancedBracket.isBalanced("(]"),false);
        Assertions.assertEquals(balancedBracket.isBalanced("[[)"),false);
        Assertions.assertEquals(balancedBracket.isBalanced("()"),true);
        Assertions.assertEquals(balancedBracket.isBalanced("()[]"),true);
        Assertions.assertEquals(balancedBracket.isBalanced("([][])"),true);
        Assertions.assertEquals(balancedBracket.isBalanced("{}[]()"),true);
        Assertions.assertEquals(balancedBracket.isBalanced("{)))"),false);
        Assertions.assertEquals(balancedBracket.isBalanced("([[]]{})"),true);


    }
}