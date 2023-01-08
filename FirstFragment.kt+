package lt.augisnaudz.lab5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import org.w3c.dom.Text

class FirstFragment : Fragment() {
    private lateinit var ilgis: TextView
    private lateinit var balses: TextView
    private lateinit var skirtumas: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_first, container, false)
        ilgis = view.findViewById(R.id.ilgis)
        balses = view.findViewById(R.id.balsiu)
        skirtumas = view.findViewById(R.id.skirtumas)

        val bundle = arguments
        val message = bundle?.getString("7089")
        println(message+ "SHEEEEEEEEEEEEEEESH")
        if (message != null) {
            ilgis.text = "Teksto ilgis yra " + message.length.toString() + " simboliu"
            balses.text = "Tarp ju yra " + countVowels(message.toString()).toString() + " balsiu"
            skirtumas.text = "Is viso yra " + countSmol(message).toString() + " mazuju raidziu ir " + countBig(message).toString() + " didziuju raidziu"
        }
        return view
    }

    fun countVowels(str: String): Int {
        var count = 0
        for (char in str) {
            when (char.lowercaseChar()) {
                'a', 'e', 'i', 'o', 'u' -> count++
            }
        }
        return count
    }

    fun countBig(str: String): Int {
        var big = 0

        for(letter in str){
            if(letter.isUpperCase()){
                big++
            }
        }
        return big
    }

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
