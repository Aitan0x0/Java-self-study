package javaCollections;


public enum Category {
    TV("Televizor"),
    ELEKTRONIKA("Elektronika"),
    TELEFONLAR("Telefon"),
    MEBELLER("Mebeller"),
    YUMUSAQ_MEBEL("Yumusaq mebel"),
    TEMIZLIK("Temizlik esyasi"),
    GEYIM("Geyim"),
    AYAQQABI("Ayaqqabi"),
    CANTA("Canta"),
    KOSMETIK("Kosmetik vasiteler");

    private final String displayName;

    Category(String displayName) {
        this.displayName = displayName;

    }

    public String getDisplayName() {
        return displayName;
    }
}
