-- Team 테이블 생성
CREATE TABLE team (
    id SERIAL PRIMARY KEY,         -- 팀 ID
    name VARCHAR(100) NOT NULL,    -- 팀 이름
    description TEXT               -- 팀 설명
);

-- User 테이블 생성
CREATE TABLE users (
   id SERIAL PRIMARY KEY,         -- 사용자 ID
   name VARCHAR(100) NOT NULL,    -- 사용자 이름
   email VARCHAR(255) UNIQUE NOT NULL,  -- 이메일 (고유 값)
   team_id INT,                   -- 팀 ID (외래 키)
   FOREIGN KEY (team_id) REFERENCES team (id)
);


-- 초기 데이터 삽입
INSERT INTO team (name, description) VALUES
('Development', 'Handles application development'),
('Marketing', 'Focuses on marketing strategies'),
('Support', 'Provides customer support');

INSERT INTO users (name, email, team_id) VALUES
('Alice', 'alice@example.com', 1),
('Bob', 'bob@example.com', 1),
('Charlie', 'charlie@example.com', 2),
('Daisy', 'daisy@example.com', 3);