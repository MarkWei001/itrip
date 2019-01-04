package cn.itrip.dao;

import cn.itrip.commons.Constants;
import cn.itrip.commons.EmptyUtils;
import cn.itrip.commons.Page;
import org.apache.log4j.Logger;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.impl.XMLResponseParser;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;

import java.util.List;

public class BaseQuery<T> {
    private HttpSolrClient httpSolrClient;
    static Logger logger=Logger.getLogger(BaseQuery.class);

    public  BaseQuery(String url){
        httpSolrClient=new HttpSolrClient(url);
        httpSolrClient.setParser(new XMLResponseParser());
        httpSolrClient.setConnectionTimeout(500);
    }

    public Page<T> queryPage(SolrQuery query,Integer pageNo,Integer pageSize,Class clazz) throws  Exception{
        Integer rows=EmptyUtils.isEmpty(pageSize)?Constants.DEFAULT_PAGE_SIZE:pageSize;
        Integer currPage=(EmptyUtils.isEmpty(pageNo)?Constants.DEFAULT_PAGE_NO-1:pageNo-1);
        Integer start=currPage*rows;
        query.setStart(start);

        query.setRows(rows);
        QueryResponse queryResponse=httpSolrClient.query(query);
        SolrDocumentList docs=queryResponse.getResults();
        Page<T> page=new Page<>(currPage+1, query.getRows(),new Long(docs.getNumFound()).intValue());
        List<T> list=queryResponse.getBeans(clazz);
        page.setRows(list);
        return  page;
    }
    public  List<T> queryList(SolrQuery query,Integer pageSize,Class clazz) throws Exception{
        query.setStart(0);
        query.setRows(EmptyUtils.isEmpty(pageSize)?Constants.DEFAULT_PAGE_SIZE:pageSize);
        QueryResponse queryResponse=httpSolrClient.query(query);
        List<T> list=queryResponse.getBeans(clazz);
        return list;
    }
}
