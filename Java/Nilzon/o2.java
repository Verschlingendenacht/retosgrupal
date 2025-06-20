package Java.Nilzon;

/*
* Objetivo: encontrar la resta mas grande posible de un arreglo dado
* Condiciones de la resta a retornar:
* el indice del primer operando debe ser menor al segundo operando (osea, debe de encontrarse en orden de izquierda a derecha cada pareja)
* el valor del primer indice debe ser menor al valor del segundo indice
* */

class o2 {

    static public int maximumDifference(int[] nums) {
        int min = nums[0]; //dada la condicion, asumiremos que el primer numero es el menor
        int maxDiff = -1; //de esta forma retornamos directamente -1 (como pide el problema) sin importarnos que suceda

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min) {
                maxDiff = Math.max(maxDiff, nums[i] - min); //maxDiff representa la resta anterior o -1, si la resta actual es mayor entonces hemos encontrado el objetivo
            } else {
                min = nums[i]; //si no se encontraron parejas donde min sea el menor, probamos con el siguiente min
            }
        }
        return maxDiff;
    }

}