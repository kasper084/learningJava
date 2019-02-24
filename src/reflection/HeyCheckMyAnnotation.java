package reflection;

import annotation.SuspiciousAnnotation;

class HeyCheckMyAnnotation {

    @SuspiciousAnnotation(a = 2, b = 5)
    public void test(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }
}
