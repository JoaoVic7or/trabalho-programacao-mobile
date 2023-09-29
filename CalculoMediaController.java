public class CalculoMediaController {
    public static Float getCalcularMedia(String a1, String a2, String a3){
        return (getNota(a1) + getNota(a2) + getNota(a3)) / 3;
    }

    private static Float getNota(String nota){
        if(nota == null){
            return 0.0f;
        }
        else {
            return Float.parseFloat(nota);
        }
    }
}
