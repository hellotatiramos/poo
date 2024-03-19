package com.tatiramos.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {

    /*
    Métodos estáticos são métodos que podem ser chamados sem a necessidade de criar uma instância
    da classe. Eles são frequentemente usados para fornecer métodos de utilidade ou para acessar
    variáveis estáticas.
     */

    public static String converterDateparaDataEHora(Date data){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return formatador.format(data);
    }

    public static String converterDateparaData(Date data){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return formatador.format(data);
    }

    public static String converterDateparaHora(Date data){
        SimpleDateFormat formatador = new SimpleDateFormat("HH:mm:ss");
        return formatador.format(data);
    }
}
