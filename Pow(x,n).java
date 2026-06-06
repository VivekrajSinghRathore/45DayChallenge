class Pow(x,n) {
    public double myPow(double x, int n) {
        if (x == 1.0) return 1.0;
        if (x == -1.0) return (n % 2 == 0) ? 1.0 : -1.0;

        long p = n;          
        if (p < 0) {
            x = 1.0 / x;
            p = -p;
        }

        double result = 1.0;
        while (p > 0) {
            if ((p & 1) == 1) result *= x;
            x *= x;
            p >>= 1;
        }
        return result;
    }
}
