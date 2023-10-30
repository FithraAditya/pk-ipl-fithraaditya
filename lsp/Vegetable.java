package lsp;

import java.util.Date;

public class Vegetable extends FoodProduct{
    @Override
    String getName(){
        return "Brocoli";
    }
    @Override
    Date getExpiredDate(){
        return new Date();
    }
}
