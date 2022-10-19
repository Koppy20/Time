class Entry {
    public static void main(String[] args) {
        Time t = new Time(10, 1, 1);
        t.display();
        t.setTime(20, 50, 50);
        t.display();
        t.nextSecond();
        t.display();
        t.nextSecond();
        t.display();
        t.setTime(4, 0, 0);
        t.display();
        t.previousSecond();
        t.display();
    }
}