/*
Dado un array de enteros nums y un entero objetivo, devuelve los índices de los dos números de forma que sumen el objetivo. Puedes asumir que cada entrada tendrá exactamente una solución y no puedes usar el mismo elemento dos veces. Puedes devolver la respuesta en cualquier orden.
*/

// arreglo de numeros enteros
// entero objetivo
// [2,6,5,4,3], 8


/*
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
*/

/*
Restricciones:
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
*/

const xd: string = "lolazo"
const lol: string = "lo quiero locamente"

console.log(xd)
console.log(lol)

//SOLUCION NUESTRA
function twoSum(nums: number[], target: number): number[] {

    let numerosSuma: number[] = [];

    for(let i: number = 0; i < nums.length; i++){
        //logica
        for(let j: number = i + 1; j < nums.length; j++){
            if(nums[i]+nums[j]===target){
                numerosSuma.push(i);
                numerosSuma.push(j);
            }
        }
    }

    return numerosSuma;
};

console.log(twoSum([2,7,11,15],9)); //0,1

//SOLUCION REAL
function twoSum2(nums: number[], target: number): number[] {

    for (let i = 0; i < nums.length; i++) {
        for (let j = i + 1; j < nums.length; j++) {
            if (nums[j] === target - nums[i]) {
            
            
            
                return [i, j];
            }
        }
    }
    // Return an empty array if no solution is found
    return [];
}

