import math


def solution(players, m, k):
    answer = 0
    live_server = 1
    server_liftime = {}
    for i,player in enumerate(players, start=1):
        print(f'player[{i}] - {player}')
        # 서버 증설 시간 계산
        for key, v in list(server_liftime.items()):
            if i - key == k:
                live_server = live_server - v
                print(f'증설 서버 종료 - {key}에 실행한 서버')
                del server_liftime[key]

        print(f'실행중인 서버 갯수 - {live_server}')            
        # 실행중인 서버 계산
        if player+1 > live_server * m: # 서버 가용 가능 인원 (live_server * m)
            t = player - live_server*m
            n =  math.floor(t / m) +1
            live_server = live_server + n
            server_liftime[i] = n
            print(f'증설 서버 갯수 - {n}')
            answer +=  n   # 서버 증설 

    print("-----------------")
    print(f'서버 증설  - {answer}')
    return answer


solution(	[0, 2, 3, 3, 1, 2, 0, 0, 0, 0, 4, 2, 0, 6, 0, 4, 2, 13, 3, 5, 10, 0, 1, 5], 3, 5)



