SET NAMES utf8mb4;

USE job_backup;

DROP PROCEDURE IF EXISTS job_schema_update;

DELIMITER <JOB_UBF>

CREATE PROCEDURE job_schema_update()
BEGIN

    DECLARE db VARCHAR(100);
    SET AUTOCOMMIT = 0;
    SELECT DATABASE() INTO db;

    IF NOT EXISTS(SELECT 1
                  FROM information_schema.COLUMNS
                  WHERE TABLE_SCHEMA = db
                    AND TABLE_NAME = 'export_job'
                    AND COLUMN_NAME = 'is_cleaned') THEN
        ALTER TABLE `job_backup`.`export_job` ADD COLUMN `is_cleaned` tinyint(1) UNSIGNED NOT NULL DEFAULT 0;
    END IF;

    IF NOT EXISTS(SELECT 1
                  FROM information_schema.COLUMNS
                  WHERE TABLE_SCHEMA = db
                    AND TABLE_NAME = 'import_job'
                    AND COLUMN_NAME = 'is_cleaned') THEN
        ALTER TABLE `job_backup`.`import_job` ADD COLUMN `is_cleaned` tinyint(1) UNSIGNED NOT NULL DEFAULT 0;
    END IF;

COMMIT;
END <JOB_UBF>
DELIMITER ;
CALL job_schema_update();

DROP PROCEDURE IF EXISTS job_schema_update;

