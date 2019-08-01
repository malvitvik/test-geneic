package generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //List<T>
        List<A1> a1_list = new ArrayList<>(Arrays.asList(new A1() {}, new B1() {}, new B2() {}, new C1() {}, new C2() {},
                new D1() {}, new D2() {}, new E1() {}, new E2() {}, new E3() {}, new E4() {}));

        List<A2> a2_list = new ArrayList<>(Arrays.asList(new A2() {}, new B2() {}, new C1() {}, new C2() {},
                new D1() {}, new D2() {}, new E1() {}, new E2() {}, new E3() {}, new E4() {}));

        List<A3> a3_list = new ArrayList<>(Arrays.asList(new A3() {}, new B3() {}, new C2() {}, new C3() {},
                new D1() {}, new D2() {}, new E1() {}, new E2() {}, new E3() {}, new E4() {}));

        List<A4> a4_list = new ArrayList<>(Arrays.asList(new A4() {}, new B3() {}, new B4() {}, new C2() {}, new C3() {},
                new D1() {}, new D2() {}, new E1() {}, new E2() {}, new E3() {}, new E4() {}));

        List<B2> b2_list = new ArrayList<>(Arrays.asList(new B2() {}, new C1() {}, new C2() {},
                new D1() {}, new D2() {}, new E1() {}, new E2() {}, new E3() {}, new E4() {}));

        List<B3> b3_list = new ArrayList<>(Arrays.asList(new B3() {}, new C2() {}, new C3() {},
                new D1() {}, new D2() {}, new E1() {}, new E2() {}, new E3() {}, new E4() {}));

        List<C1> c1_list = new ArrayList<>(Arrays.asList(new C1() {}, new D1() {}, new E1() {}, new E2() {}));

        List<C2> c2_list = new ArrayList<>(Arrays.asList(new C2() {},
                new D1() {}, new D2() {}, new E1() {}, new E2() {}, new E3() {}, new E4() {}));

        //List<? extends T>
        List<? extends A1> a1ext1_list = a1_list;

        List<? extends A1> a1ext2_list = b2_list;

        List<? extends A1> a1ext3_list = c1_list;

        List<? extends A1> a1ext4_list = c2_list;

        List<? extends A1> a1ext5_list = b2_list;

        //List<? super T>
        List<? super C1> c1sup1_list = a1_list;

        List<? super C1> c1sup2_list = a2_list;

        List<? super C1> c1sup3_list = b2_list ;

        List<? super C1> c1sup4_list = b2_list;

        List<? super C1> c1sup5_list = c1_list;
    }


}

interface A1{}
interface A2{}
interface A3{}
interface A4{}

interface B1 extends A1{}
interface B2 extends A1,A2{}
interface B3 extends A3,A4{}
interface B4 extends A4{}

interface C1 extends B2{}
interface C2 extends B2,B3{}
interface C3 extends B3{}

interface D1 extends C1,C2{}
interface D2 extends C2{}

interface E1 extends D1{}
interface E2 extends D1{}
interface E3 extends D2{}
interface E4 extends D2{}