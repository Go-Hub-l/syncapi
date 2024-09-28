package com.xlb.syncapi.api;

public interface ReimbursementSyncService {
    /**
     *
     * @param obj
     * @return:成功插入的行数
     */
    int insertBatch(String obj);
}
