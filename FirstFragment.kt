package lt.augisnaudz.LabWork005

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class FirstFragment : Fragment() {
    private lateinit var length: TextView
    private lateinit var vowel: TextView
    private lateinit var diff: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_first, container, false)
        ilgis = view.findViewById(R.id.length)
        balses = view.findViewById(R.id.vowel)
        skirtumas = view.findViewById(R.id.diff)

// skirta gauti package'ui

        val bundle = arguments
        val message = bundle?.getString("7089")
        if (message != null) {
            ilgis.text = "Teksto ilgis yra " + message.length.toString() + " simboliu"
            balses.text = "Tarp ju yra " + countVowels(message.toString()).toString() + " balsiu"
            skirtumas.text = "Is viso yra " + countSmol(message).toString() + " mazuju raidziu ir " 
            + countBig(message).toString() + " didziuju raidziu"
        }
        return view
    }

//skirta skaiciuoti balses

    fun countVowels(str: String): Int {
        var count = 0
        for (char in str) {
            when (char.lowercaseChar()) {
                'a', 'e', 'i', 'o', 'u' -> count++
            }
        }
        return count
    }

/skirta skaiciuoti didžiąsias raides

    fun countBig(str: String): Int {
        var big = 0

        for(letter in str){
            if(letter.isUpperCase()){
                big++
            }
        }
        return big
    }

//skirta skaičiuoti mažasias raides

    fun countSmol(str: String): Int{
        var smol = 0

        for(letter in str) {
            if(letter.isLowerCase()) {
                smol++
            }
        }

        return smol
    }
}
