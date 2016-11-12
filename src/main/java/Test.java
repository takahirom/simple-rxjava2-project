import io.reactivex.*;
import javafx.util.Pair;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Single.zip(Single.just(1), Single.just(1), Pair::new)
                .test()
                .assertValue(new Pair(1, 1));
    }

}

