package numberbaseball;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class MapTest {

    @Test
    void name() {
        Map<String, String> englishKorean = new HashMap<>();
        englishKorean.put("book", "책");
        englishKorean.put("apple", "사가ㅗ"); // 이 코드를 수정하지 마세요
        englishKorean.put("car", "자동차");

        englishKorean.put("apple","사과");
        System.out.println(englishKorean);


    }

    @Test
    void map() {
        Map<String,String> studentAgeMap = new HashMap<>();

        studentAgeMap.put("이무강","4세");
        studentAgeMap.put("이구찌","4세");
        studentAgeMap.put("이장순","6세");

        System.out.println(studentAgeMap);

        studentAgeMap.get("이장순");//get을 사용하여 특정 품목을 출력할수 있다
        System.out.println("이장순");










    }


    @Test
    void fruitPrice() {
        Map<String,Integer>fruitPriceMap = new HashMap<>();
        fruitPriceMap.put("사과",5000);
        fruitPriceMap.put("망고",1000);
        fruitPriceMap.put("석류",500);

        System.out.println(fruitPriceMap);

        fruitPriceMap.put("사과",2000);

        int price = 1500;
        System.out.println(fruitPriceMap);
        for (Map.Entry<String, Integer> entry : fruitPriceMap.entrySet()) {
            String 과일이름 = entry.getKey();
            Integer 가격 = entry.getValue();
            if(fruitPriceMap.get(과일이름) > price){
                System.out.println(과일이름);
            }
        }




    }

    @Test
    void productStock() {
        Map<String,Integer>productStock = new HashMap<>();
        //get으로 읽고 -1 사용하여 하나씩 재고감소하기

        productStock.put("갤럭시 s24", 8);
        productStock.put("삼다수 2L", 20);
        productStock.put("칙촉 오리지널 6+2", 10);
        productStock.put("M4 맥북 프로", 5);

        for (Map.Entry<String,Integer> entry : productStock .entrySet()){
            String 품목이름 = entry.getKey();
            Integer 재고수량 = entry.getValue();

        }


    }
}
