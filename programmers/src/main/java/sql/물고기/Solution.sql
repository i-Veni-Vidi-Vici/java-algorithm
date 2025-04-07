SELECT
    FI.ID,
    FN.FISH_NAME,
    FI.LENGTH
FROM
    FISH_INFO FI
        JOIN
    FISH_NAME_INFO FN
    ON FI.FISH_TYPE = FN.FISH_TYPE
        JOIN (
        SELECT
            FISH_TYPE,
            MAX(LENGTH) AS MAX_LENGTH
        FROM
            FISH_INFO
        WHERE
            LENGTH IS NOT NULL
        GROUP BY
            FISH_TYPE
    ) MAX_FI
             ON FI.FISH_TYPE = MAX_FI.FISH_TYPE
                 AND FI.LENGTH = MAX_FI.MAX_LENGTH
ORDER BY
    FI.ID ASC;