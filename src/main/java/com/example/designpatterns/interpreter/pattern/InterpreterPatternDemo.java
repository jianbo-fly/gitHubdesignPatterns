package com.example.designpatterns.interpreter.pattern;

import com.example.designpatterns.interpreter.pattern.impl.AndExpression;
import com.example.designpatterns.interpreter.pattern.impl.OrExpression;
import com.example.designpatterns.interpreter.pattern.impl.TerminalExpression;

/**
 * 用途:{@link com.example.designpatterns.interpreter.pattern.impl.AndExpression#AndExpression}
 *
 * @author tangjianbo
 * @date 2023/01/07 15:56
 */
public class InterpreterPatternDemo {
    /**
     * 规则：Robert 和 John 是男性
     * @return
     */
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    /**
     * 规则：Julie 是一个已婚的女性
     * @return
     */
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married Julie"));
    }
}
