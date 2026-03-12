package eu.kanade.tachiyomi.extension.tr.kabusmanga

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class HolyScan :
    Madara(
        "Holy Scan",
        "https://holyscans.com.tr/",
        "tr",
        dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.ROOT),
    ) {
    override val useLoadMoreRequest = LoadMoreStrategy.Never
    override val useNewChapterEndpoint = true
}
