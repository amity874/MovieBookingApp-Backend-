package com.Amit.MovieBookingApp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class language {
    @Id
    private  int LanguageId;
    @Column(length = 30,nullable = false)
    private String LanguageName;

    public int getLanguageId() {
        return LanguageId;
    }

    public String getLanguageName() {
        return LanguageName;
    }

    public void setLanguageId(int languageId) {
        LanguageId = languageId;
    }

    public void setLanguageName(String languageName) {
        LanguageName = languageName;
    }

    @Override
    public String toString() {
        return "language{" +
                "LanguageId=" + LanguageId +
                ", LanguageName='" + LanguageName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        language language = (language) o;
        return LanguageId == language.LanguageId && Objects.equals(LanguageName, language.LanguageName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(LanguageId, LanguageName);
    }
}
