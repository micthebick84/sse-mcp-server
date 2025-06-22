SSE-MCP-SERVER EXAMPLE

서버 실행 이후 mcp-remote 설치가 필요
npm install -g mcp-remote


claude 설정을 위한 claude_desktop_config.json 수정 필수
{ "mcpServers": { "remote-example": { "command": "npx", "args": [ "mcp-remote", "http://localhost:8080/api/v1/sse" ] } } }

