class RichParent{
    long money = 1000000000000l;
    int property = 1000;
}

final class RichGirl extends RichParent{
    public int dprop = 0;

}

class GreedyBoy extends RichGirl{
    public int gprop = 5;
}

// final class cannot be inherited 