package shy.luo.article;
 
public class ArticleInfo {
        private int id;
        private String title;
        private String abs;
        private String url;
 
        public ArticleInfo(int id, String title, String abs, String url) {
                this.id = id;
                this.title = title;
                this.abs = abs;
                this.url = url;
        }
 
        public void setId(int id) {
                this.id = id;
        }
 
        public int getId() {
                return this.id;
        }
 
        public void setTitle(String title) {
                this.title = title;
        }
 
        public String getTitle() {
                return this.title;
        }
 
        public void setAbstract(String abs) {
                this.abs = abs;
        }
 
        public String getAbstract() {
                return this.abs;
        }
 
        public void setUrl(String url) {
                this.url = url;
        }
 
        public String getUrl() {
                return this.url;
        }
}