package org.hucompute.textimager.uima.ddc.fasttext.service.service.impl;

import io.quarkus.arc.Lock;
import org.hucompute.textimager.uima.ddc.fasttext.service.service.FastTextDDC2Service;

import javax.annotation.PreDestroy;
import javax.inject.Singleton;

@Lock
@Singleton
public class FastTextDDC2ENDim100Service extends FastTextDDC2Service {
    FastTextDDC2ENDim100Service() throws Exception {
        this(
                "",
                "",
                ""
        );
    }

    FastTextDDC2ENDim100Service(String disambigTag, String disambigLabelReplace, String disambigLabelReplaceWith) throws Exception {
        // TODO paths in container are absolute!
        // TODO WICHTIG die parameter weiter anpassen an die Daten aus der TI Config
        super(
                "/home/stud_homes/baumartz/mnt/resources/nlp/bin/categorization/fastText_original_for_ducc_annotators/fasttext",
                "en,/home/stud_homes/baumartz/mnt/resources/nlp/models/categorization/ddc/ddc2_2018/wikipedia_en.v8.lemma.nopunct_gnd_ddc.v3.with_wikidata_model_dim100_pretreined-glove.6B.100d.txt_epoch100000.epoch10000.bin,95",
                true,
                1,
                true,
                false,
                "/home/stud_homes/baumartz/mnt/resources/nlp/models/categorization/am_posmap.txt",
                true,
                false,
                false, // TODO was true originally
                false,
                100,
                "ddc2;dim100;ddc2_2018/wikipedia_en.v8.lemma.nopunct_gnd_ddc.v3.with_wikidata_model_dim100_pretreined-glove.6B.100d.txt_epoch100000.epoch10000.bin",
                disambigTag,
                disambigLabelReplace,
                disambigLabelReplaceWith
        );
    }

    @PreDestroy
    void preDestroy() {
        this.exit();
    }
}
