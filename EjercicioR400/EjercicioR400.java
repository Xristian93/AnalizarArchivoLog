class EjercicioR400
{
    /**
     * Constructor
     * @param serieNumericaDeOrigen una cadeba conteniendo solo digitos de 
     *                              longitud no determinada
     */
    private String cadenaDigitos;
    
    public EjercicioR400(String serieNumericaDeOrigen) {
        cadenaDigitos = serieNumericaDeOrigen;
    }

    /**
     * Devuelve el producto más alto de la serie de origen considerando solo 
     * los productos de las subseries con número de dígitos cantidadNumerosConsecutivos
     * @param longitudSerie la cantidad de digitos a considerar consecutivos
     * @return el producto más alto encontrado en la serie de origen. Si cantidadNumerosConsecutivos
     *         es cero o negativo, devuelve -1. Si cantidadNumerosConsecutivos es menor que el tamaño
     *         de la serie de origen devuelve también -1
     * 
     */
    public long encontrarProductoMasAlto(int cantidadNumerosConsecutivos) 
    {
        int productoMasAlto = -1;
        if (cantidadNumerosConsecutivos > 0 && cantidadNumerosConsecutivos <= cadenaDigitos.length()){
            for (int i = 0; i != cadenaDigitos.length()-cantidadNumerosConsecutivos+1 ; i++){
                int productoActual = 1;
                for (int j = 0; j < cantidadNumerosConsecutivos; j++){
                    productoActual *= Integer.parseInt(cadenaDigitos.substring(i+j, i+j+1));
                }
                if (productoActual > productoMasAlto){
                    productoMasAlto = productoActual;
                }
            }
        }
        return productoMasAlto;
    }
}