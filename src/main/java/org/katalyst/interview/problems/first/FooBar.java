package org.katalyst.interview.problems.first;

public class FooBar {

    private Integer lowEnd;
    private Integer highEnd;

    public FooBar(){
        lowEnd = 1;
        highEnd = 100;
    }

    public FooBar(Integer lowEnd, Integer highEnd){
        this.lowEnd = lowEnd;
        this.highEnd = highEnd;
    }

    /**
     * FooBar cycle, this is an N complexity approach.
     */
    public void FooBarQuestionNComplexity(){
        for (int i = lowEnd; i <= highEnd; i++){
            if((i%3) == 0 && (i%5) == 0){
                System.out.println("FooBar");
            }else if((i%3) == 0){
                System.out.println("Foo");
            }else if((i%5) == 0){
                System.out.println("Bar");
            }else {
                System.out.println(i);
            }
        }
    }

    /**
     * Main for FooBar, this will run the class with its default and different
     * values.
     * @param args Console Arguments
     */
    public static void main(String[] args) {
        FooBar foo = new FooBar();
        foo.FooBarQuestionNComplexity();

        //Edge Case
        foo = new FooBar(1, Integer.MAX_VALUE);
        foo.FooBarQuestionNComplexity();
    }

}
