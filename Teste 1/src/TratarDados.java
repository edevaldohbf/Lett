public class TratarDados {
    boolean dados(String nome, String idade, String tamanho){
        boolean status = true;
        for(int i = 0; i < nome.length(); i++) {
            if (Character.isDigit(nome.charAt(i)) == true)
            {
                status = false;
            }
        }
        if (nome.isEmpty()){
            status = false;
        }
        float X = Float.parseFloat(idade);
        if(X <= 0){
            status = false;
        }
        float Y = Float.parseFloat(tamanho);
        if (Y <= 0){
            status = false;
        }
        return status;
    }
}
