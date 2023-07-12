Задача Two Sum на LeetCode заключается в том, чтобы найти два числа в заданном массиве **nums**, сумма которых равна
заданному целому числу **target**. Вам нужно вернуть индексы этих двух чисел в виде массива.

```java
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        // Create a Map to keep integers and their indices
        Map<Integer, Integer> map = new HashMap<>();

        // Key = integer, Value = index
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        return null;
    }
}
```

Решение использует хэш-таблицу (HashMap) для хранения чисел и их индексов. Мы проходим по массиву чисел один раз. Для каждого числа, мы вычисляем разницу между целевым числом и текущим числом. Затем проверяем, есть ли эта разница в хэш-таблице. Если она там присутствует, значит мы нашли пару чисел сумма которых равна целевому числу. Возвращаем найденные индексы в виде массива. Если не найдено никаких пар, возвращаем пустой массив.