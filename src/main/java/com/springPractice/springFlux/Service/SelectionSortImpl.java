package com.springPractice.springFlux.Service;

import java.util.List;

public class SelectionSortImpl implements SelectionSort {
    
    // 選択ソートを行うメソッド
    public List<Integer> selectionSort(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            // 最小値のインデックスを保持するテンポラリ変数
            int minIndex = i;
            
            for (int j = i + 1; j < list.size(); j++) {
                // 最小値を探す
                if (list.get(i) > list.get(j)) {
                    minIndex = j;
                }
            }

            // 最小値を先頭に移動
            int temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
        return list;
    }
    
}
