interface Building {
    abstract void heightDisplay();
    static void widthDisplay()
    {
        System.out.println("width is 1");
    }
    default void lengthDisplay()
    {
        System.out.println("length is 10");
    }
}
