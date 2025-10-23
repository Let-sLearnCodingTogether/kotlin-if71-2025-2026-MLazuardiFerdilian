package oop

import kotlin.properties.Delegates

class NilaiMhs{
    var nilai : Float by Delegates.vetoable(0.0f){
        property, oldValue, newValue ->
        if(newValue> 0.0f && newValue <=100f){
            println("Nilai berhasil di ubah")
            true
        }else{
            println("Nilai harus lebih besar dari 0 dan kecil")
            false
        }
    }

}