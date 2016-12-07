package com.pdfjet.pdfjet;

class ContextSubstFormat3 {
    int substFormat;
    int glyphCount;
    int substCount;
    int[] coverage;                         // [glyphCount]
    SubstLookupRecord[] substLookupRecord;  // [substCount]
}
