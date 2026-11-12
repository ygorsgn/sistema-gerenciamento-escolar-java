## Economia de modelo
- Para buscas no código, leitura de muitos arquivos, resumos e tarefas mecânicas
  (renomear, formatar, listar), delegue ao subagente `buscador` (Haiku).
- Para implementações simples e bem definidas, delegue ao subagente `executor` (Sonnet).
- Reserve o modelo principal (Opus) para planejamento, decisões de arquitetura e bugs difíceis.
- Esta instrução já autoriza criar esses subagentes sem pedir confirmação.
