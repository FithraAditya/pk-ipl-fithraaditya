package lsp;

import java.util.Date;

public class Vegetable extends Product{
    @Override
    String getName(){
        return "Brocoli";
    }
    @Override
    Date getExpiredDate(){
        return new Date();
    }
}
