USE job_execute;

SET NAMES utf8mb4;

DROP PROCEDURE IF EXISTS job_schema_update;

DELIMITER <JOB_UBF>

CREATE PROCEDURE job_schema_update()
BEGIN

    DECLARE db VARCHAR(100);
    SET AUTOCOMMIT = 0;
    SELECT DATABASE() INTO db;

    IF NOT EXISTS(SELECT 1
                  FROM information_schema.statistics
                  WHERE TABLE_SCHEMA = db
                    AND TABLE_NAME = 'task_instance'
                    AND INDEX_NAME = 'idx_appId_totalTime_createTime') THEN
        ALTER TABLE task_instance ADD INDEX idx_appId_totalTime_createTime(app_id,total_time,create_time);
    END IF;
	
    COMMIT;
END <JOB_UBF>
DELIMITER ;
COMMIT;
CALL job_schema_update();

DROP PROCEDURE IF EXISTS job_schema_update;


