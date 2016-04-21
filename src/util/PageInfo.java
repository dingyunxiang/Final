package util;

import java.util.List;
/*
 * ·ÖÒ³ÐÅÏ¢Àà£¬°üº¬·ÖÒ³µÄËùÓÐÐÅÏ¢
 *
 *
 *
 */
public class PageInfo {

    //ÇëÇóµÄActionÃû£»
    String action;

    //Êý¾Ý
    List list;

    //×Ü¼ÇÂ¼Êý
    int recordCount;
    //×ÜÒ³Êý
    int pageCount;

    //µ±Ç°Ò³ºÅ
    int currentPage=1;

    public PageInfo() {
        super();
    }

    public PageInfo(String action, int currentPage) {
        super();
        this.action = action;
        this.currentPage = currentPage;
    }

    //Ã¿Ò³¼ÇÂ¼Êý£»
    int pageSize=5;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
