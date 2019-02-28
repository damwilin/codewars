package MatchingAndSubstituting;

public class MatchSubst {
    //https://www.codewars.com/kata/latest/my-languages
    public static void main(String[] arg) {
    }

    public static String change(String s, String prog, String version) {
        String s1 = "Program title: Primes\nAuthor: Kern\nCorporation: Gold\nPhone: +1-503-555-0091\nDate: Tues April 9, 2005\nVersion: 6.7\nLevel: Alpha";
        return null;
    }

    class Data {
        private String programTitle;
        private String authorName;
        private String corporation;
        private String phoneNumber;
        private String date;
        private String version;
        private String level;

        public String getProgramTitle() {
            return programTitle;
        }

        public void setProgramTitle(String programTitle) {
            this.programTitle = programTitle;
        }

        public String getAuthorName() {
            return authorName;
        }

        public void setAuthorName(String authorName) {
            this.authorName = authorName;
        }

        public String getCorporation() {
            return corporation;
        }

        public void setCorporation(String corporation) {
            this.corporation = corporation;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }
    }

}